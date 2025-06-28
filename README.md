# CGAL SWIG Bindings for Maven

This project provides Java bindings for the [CGAL (Computational Geometry Algorithms Library)](https://www.cgal.org/) using [SWIG (Simplified Wrapper and Interface Generator)](http://www.swig.org/). The bindings are packaged as a Maven project to facilitate easy integration into Java applications requiring computational geometry functionality.

## Overview

CGAL is a software project that provides efficient and reliable geometric algorithms in the form of a C++ library. This project creates Java bindings for various CGAL modules, allowing Java developers to leverage CGAL's powerful computational geometry capabilities without directly interfacing with C++ code.

### Supported CGAL Modules

- **Kernel**: Basic geometric objects (Point_2, Point_3, Segment_2, Segment_3, etc.)
- **Triangulation_2/3**: 2D and 3D triangulation algorithms
- **Polyhedron_3**: 3D polyhedral surface data structure
- **AABB_tree**: Axis-Aligned Bounding Box tree for efficient geometric queries
- **Spatial_searching**: Spatial data structures and search algorithms
- **Alpha_shape_2**: Alpha shapes in 2D
- **Convex_hull_2/3**: Convex hull algorithms in 2D and 3D
- **Mesh_2/3**: 2D and 3D mesh generation
- **Surface_mesher**: Surface meshing algorithms
- **Interpolation**: Various interpolation methods
- **Polygon_mesh_processing**: Mesh processing algorithms
- **Point_set_processing_3**: Point set processing operations
- **Voronoi_diagram_2**: 2D Voronoi diagrams
- **And more...**

## Prerequisites

### System Requirements

- **Operating System**: Linux, Windows (macOS support may vary)
- **Java**: JDK 10 or higher
- **Maven**: 3.6+ for Java build management
- **CMake**: 2.8+ for building native libraries
- **CGAL**: 4.0+ (CGAL library and headers)
- **SWIG**: 3.0+ for generating language bindings
- **C++ Compiler**: GCC, Clang, or MSVC with C++11 support

### Dependencies

#### Ubuntu/Debian
```bash
sudo apt-get update
sudo apt-get install cmake libcgal-dev swig default-jdk maven build-essential
```

#### CentOS/RHEL/Fedora
```bash
sudo yum install cmake CGAL-devel swig java-11-openjdk-devel maven gcc-c++
# or for newer versions:
sudo dnf install cmake CGAL-devel swig java-11-openjdk-devel maven gcc-c++
```

#### Windows
- Install [Visual Studio](https://visualstudio.microsoft.com/) with C++ support
- Install [CMake](https://cmake.org/download/)
- Install [CGAL](https://www.cgal.org/download.html)
- Install [SWIG](http://www.swig.org/download.html)
- Install [Java JDK](https://openjdk.java.net/)
- Install [Maven](https://maven.apache.org/download.cgi)

## Building from Source

### 1. Clone the Repository
```bash
git clone https://github.com/jon-daeh/cgal-swig-bindings-maven.git
cd cgal-swig-bindings-maven
```

### 2. Build Native Libraries
The project uses CMake to build the native SWIG bindings:

```bash
mkdir build
cd build
cmake ..
make -j$(nproc)
```

#### Build Options
You can customize the build with various options:

```bash
# Build only Java bindings (default: ON)
cmake -DBUILD_JAVA=ON -DBUILD_PYTHON=OFF -DBUILD_RUBY=OFF ..

# Specify CGAL installation path if needed
cmake -DCGAL_DIR=/path/to/cgal ..

# Release build for better performance
cmake -DCMAKE_BUILD_TYPE=Release ..
```

### 3. Copy Libraries
After building, copy the generated native libraries to the `lib` directory:

```bash
# From the build directory
cp lib/*.so ../lib/  # Linux
# or
cp lib/*.dll ../lib/  # Windows
```

### 4. Build Java Package
Use Maven to build the Java package:

```bash
# Return to project root
cd ..
mvn clean compile package
```

## Usage

### Loading Native Libraries

Before using any CGAL functionality, you must load the native libraries:

```java
import no.sintef.ocean.maritim.cgal.LoadNativeLibraries;

public class MyApp {
    static {
        LoadNativeLibraries.load();
    }
    
    // Your application code here
}
```

### Basic Example: Working with 2D Points and Polygons

```java
package com.example;

import CGAL.Kernel.Point_2;
import CGAL.Kernel.Polygon_2;
import java.util.LinkedList;
import no.sintef.ocean.maritim.cgal.LoadNativeLibraries;

public class BasicGeometryExample {
    static {
        LoadNativeLibraries.load();
    }
    
    public static void main(String[] args) {
        // Create a list of 2D points
        LinkedList<Point_2> points = new LinkedList<>();
        points.add(new Point_2(0, 0));
        points.add(new Point_2(1, 0));
        points.add(new Point_2(1, 1));
        points.add(new Point_2(0, 1));
        
        // Create a polygon from the points
        Polygon_2 polygon = new Polygon_2(points.iterator());
        
        System.out.println("Polygon has " + polygon.size() + " vertices");
        System.out.println("Polygon area: " + polygon.area());
        
        // Check if a point is inside the polygon
        Point_2 testPoint = new Point_2(0.5, 0.5);
        if (polygon.bounded_side(testPoint).ordinal() == 1) { // CGAL::ON_BOUNDED_SIDE
            System.out.println("Point is inside the polygon");
        }
    }
}
```

### 3D Geometry Example

```java
import CGAL.Kernel.Point_3;
import CGAL.Kernel.Vector_3;
import CGAL.Kernel.Sphere_3;

public class Geometry3DExample {
    static {
        LoadNativeLibraries.load();
    }
    
    public static void main(String[] args) {
        // Create 3D points
        Point_3 p1 = new Point_3(0, 0, 0);
        Point_3 p2 = new Point_3(1, 1, 1);
        
        // Create a vector
        Vector_3 vec = new Vector_3(p1, p2);
        System.out.println("Vector length: " + Math.sqrt(vec.squared_length()));
        
        // Create a sphere
        Sphere_3 sphere = new Sphere_3(p1, 1.0); // Center at p1, radius 1.0
        System.out.println("Sphere center: " + sphere.center());
    }
}
```

### Triangulation Example

```java
import CGAL.Triangulation_2.Delaunay_triangulation_2;
import CGAL.Kernel.Point_2;

public class TriangulationExample {
    static {
        LoadNativeLibraries.load();
    }
    
    public static void main(String[] args) {
        Delaunay_triangulation_2 dt = new Delaunay_triangulation_2();
        
        // Insert random points
        for (int i = 0; i < 10; i++) {
            dt.insert(new Point_2(Math.random(), Math.random()));
        }
        
        System.out.println("Triangulation has " + dt.number_of_vertices() + " vertices");
        System.out.println("Triangulation has " + dt.number_of_faces() + " faces");
    }
}
```

## Project Structure

```
cgal-swig-bindings-maven/
├── CMakeLists.txt              # Main CMake configuration
├── pom.xml                     # Maven project configuration
├── README.md                   # This file
├── SWIG_CGAL/                  # SWIG interface files
│   ├── Kernel/                 # Basic geometric objects
│   ├── Triangulation_2/        # 2D triangulation
│   ├── Triangulation_3/        # 3D triangulation
│   ├── Polyhedron_3/          # 3D polyhedra
│   ├── AABB_tree/             # Bounding box trees
│   └── ...                    # Other CGAL modules
├── cmake/                      # CMake modules and macros
├── src/main/java/             # Generated and utility Java source
│   ├── CGAL/                  # Generated CGAL bindings
│   ├── no/sintef/ocean/maritim/cgal/  # Utility classes
│   └── examples/              # Example Java programs
├── lib/                       # Native libraries (.so/.dll files)
└── data/                      # Test data files
```

## Running Examples

The project includes numerous example programs in `src/main/java/CGAL/examples/`. To run them:

1. Ensure native libraries are built and in the `lib/` directory
2. Compile and run specific examples:

```bash
# Compile all examples
cd src/main/java/CGAL/examples
javac -cp .:../../../.. *.java

# Run a specific example
java -cp .:../../../.. -Djava.library.path=../../../../../lib CGAL.examples.test_kernel
```

## Maven Integration

To use this library in your Maven project, install it to your local repository:

```bash
mvn install
```

Then add it as a dependency in your `pom.xml`:

```xml
<dependency>
    <groupId>no.sintef.ocean.maritim</groupId>
    <artifactId>cgal-swig-bindings-maven</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

## Troubleshooting

### Common Issues

1. **UnsatisfiedLinkError**: Ensure native libraries are built and accessible
   - Check that `.so` (Linux) or `.dll` (Windows) files are in the `lib/` directory
   - Verify `java.library.path` system property includes the lib directory

2. **CMake configuration fails**: 
   - Ensure CGAL is properly installed and findable by CMake
   - Set `CGAL_DIR` environment variable if needed

3. **SWIG errors**:
   - Verify SWIG version is 3.0 or higher
   - Check that SWIG is in your system PATH

4. **Compilation errors**:
   - Ensure C++ compiler supports C++11 or later
   - Verify all dependencies are installed

### Platform-Specific Notes

#### Linux
- Use `ldd` to check shared library dependencies
- Set `LD_LIBRARY_PATH` if libraries are in non-standard locations

#### Windows
- Use Dependency Walker to check DLL dependencies
- Ensure Visual C++ Redistributables are installed

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Make your changes
4. Build and test your changes
5. Commit your changes (`git commit -m 'Add amazing feature'`)
6. Push to the branch (`git push origin feature/amazing-feature`)
7. Open a Pull Request

### Development Guidelines

- Follow existing code style and patterns
- Add examples for new functionality
- Update documentation for API changes
- Test on multiple platforms when possible

## License

This project is distributed under the Boost Software License, Version 1.0, consistent with CGAL's licensing. See the [Boost Software License](http://www.boost.org/LICENSE_1_0.txt) for details.

## Acknowledgments

- [CGAL Project](https://www.cgal.org/) for the computational geometry library
- [SWIG](http://www.swig.org/) for the interface generation tool
- GeometryFactory for the original SWIG-CGAL bindings

## Support

For issues, questions, or contributions:
- Open an issue on GitHub
- Check existing examples in `src/main/java/CGAL/examples/`
- Refer to [CGAL documentation](https://doc.cgal.org/) for algorithm details

---

*This project enables Java developers to harness the power of CGAL's computational geometry algorithms through clean, well-documented bindings.*
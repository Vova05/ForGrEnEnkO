# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.15

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "C:\Program Files\JetBrains\CLion 2019.3.1\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "C:\Program Files\JetBrains\CLion 2019.3.1\bin\cmake\win\bin\cmake.exe" -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = C:\Users\sony\Desktop\OOPC++\Kurs2SIAOD5_V6

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = C:\Users\sony\Desktop\OOPC++\Kurs2SIAOD5_V6\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/Kurs2SIAOD5_V6.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Kurs2SIAOD5_V6.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Kurs2SIAOD5_V6.dir/flags.make

CMakeFiles/Kurs2SIAOD5_V6.dir/main.cpp.obj: CMakeFiles/Kurs2SIAOD5_V6.dir/flags.make
CMakeFiles/Kurs2SIAOD5_V6.dir/main.cpp.obj: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=C:\Users\sony\Desktop\OOPC++\Kurs2SIAOD5_V6\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Kurs2SIAOD5_V6.dir/main.cpp.obj"
	C:\PROGRA~2\MINGW-~1\I686-8~1.0-P\mingw32\bin\G__~1.EXE  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\Kurs2SIAOD5_V6.dir\main.cpp.obj -c C:\Users\sony\Desktop\OOPC++\Kurs2SIAOD5_V6\main.cpp

CMakeFiles/Kurs2SIAOD5_V6.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Kurs2SIAOD5_V6.dir/main.cpp.i"
	C:\PROGRA~2\MINGW-~1\I686-8~1.0-P\mingw32\bin\G__~1.EXE $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\Users\sony\Desktop\OOPC++\Kurs2SIAOD5_V6\main.cpp > CMakeFiles\Kurs2SIAOD5_V6.dir\main.cpp.i

CMakeFiles/Kurs2SIAOD5_V6.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Kurs2SIAOD5_V6.dir/main.cpp.s"
	C:\PROGRA~2\MINGW-~1\I686-8~1.0-P\mingw32\bin\G__~1.EXE $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\Users\sony\Desktop\OOPC++\Kurs2SIAOD5_V6\main.cpp -o CMakeFiles\Kurs2SIAOD5_V6.dir\main.cpp.s

# Object files for target Kurs2SIAOD5_V6
Kurs2SIAOD5_V6_OBJECTS = \
"CMakeFiles/Kurs2SIAOD5_V6.dir/main.cpp.obj"

# External object files for target Kurs2SIAOD5_V6
Kurs2SIAOD5_V6_EXTERNAL_OBJECTS =

Kurs2SIAOD5_V6.exe: CMakeFiles/Kurs2SIAOD5_V6.dir/main.cpp.obj
Kurs2SIAOD5_V6.exe: CMakeFiles/Kurs2SIAOD5_V6.dir/build.make
Kurs2SIAOD5_V6.exe: CMakeFiles/Kurs2SIAOD5_V6.dir/linklibs.rsp
Kurs2SIAOD5_V6.exe: CMakeFiles/Kurs2SIAOD5_V6.dir/objects1.rsp
Kurs2SIAOD5_V6.exe: CMakeFiles/Kurs2SIAOD5_V6.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=C:\Users\sony\Desktop\OOPC++\Kurs2SIAOD5_V6\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable Kurs2SIAOD5_V6.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\Kurs2SIAOD5_V6.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Kurs2SIAOD5_V6.dir/build: Kurs2SIAOD5_V6.exe

.PHONY : CMakeFiles/Kurs2SIAOD5_V6.dir/build

CMakeFiles/Kurs2SIAOD5_V6.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\Kurs2SIAOD5_V6.dir\cmake_clean.cmake
.PHONY : CMakeFiles/Kurs2SIAOD5_V6.dir/clean

CMakeFiles/Kurs2SIAOD5_V6.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" C:\Users\sony\Desktop\OOPC++\Kurs2SIAOD5_V6 C:\Users\sony\Desktop\OOPC++\Kurs2SIAOD5_V6 C:\Users\sony\Desktop\OOPC++\Kurs2SIAOD5_V6\cmake-build-debug C:\Users\sony\Desktop\OOPC++\Kurs2SIAOD5_V6\cmake-build-debug C:\Users\sony\Desktop\OOPC++\Kurs2SIAOD5_V6\cmake-build-debug\CMakeFiles\Kurs2SIAOD5_V6.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/Kurs2SIAOD5_V6.dir/depend


# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Provides real-time manipulator Cartesian and joint servoing."
AUTHOR = "Blake Anderson <blakeanderson@utexas.edu>"
ROS_AUTHOR = "Brian O'Neil"
HOMEPAGE = "https://ros-planning.github.io/moveit_tutorials"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD 3-Clause"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=f5654d47d02d927c4f7a04f0a51abaa1"

ROS_CN = "moveit"
ROS_BPN = "moveit_servo"

ROS_BUILD_DEPENDS = " \
    control-msgs \
    geometry-msgs \
    moveit-msgs \
    moveit-ros-planning-interface \
    rosparam-shortcuts \
    sensor-msgs \
    std-msgs \
    std-srvs \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    control-msgs \
    geometry-msgs \
    moveit-msgs \
    moveit-ros-planning-interface \
    rosparam-shortcuts \
    sensor-msgs \
    std-msgs \
    std-srvs \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    control-msgs \
    geometry-msgs \
    joy-teleop \
    moveit-msgs \
    moveit-ros-planning-interface \
    rosparam-shortcuts \
    sensor-msgs \
    spacenav-node \
    std-msgs \
    std-srvs \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    moveit-resources-panda-moveit-config \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_servo/1.0.6-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/moveit_servo"
SRC_URI = "git://github.com/ros-gbp/moveit-release;${ROS_BRANCH};protocol=https"
SRCREV = "0188cd78f7f6c69d5c016da1937e123ac46f7ca9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package is a ROS wrapper for Alvar, an open source AR tag tracking library."
AUTHOR = "Scott Niekum <sniekum@cs.umass.edu>"
ROS_AUTHOR = "Scott Niekum <sniekum@cs.umass.edu>"
HOMEPAGE = "http://ros.org/wiki/ar_track_alvar"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "LGPL-2.1"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=061abe8dc89f326789675967c8760541"

ROS_CN = "ar_track_alvar"
ROS_BPN = "ar_track_alvar"

ROS_BUILD_DEPENDS = " \
    ar-track-alvar-msgs \
    cmake-modules \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    libtinyxml \
    message-generation \
    pcl-conversions \
    pcl-ros \
    resource-retriever \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
    tf2 \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ar-track-alvar-msgs \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    libtinyxml \
    message-runtime \
    pcl-conversions \
    pcl-ros \
    resource-retriever \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
    tf2 \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ar-track-alvar-msgs \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    libtinyxml \
    message-runtime \
    pcl-conversions \
    pcl-ros \
    resource-retriever \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
    tf2 \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosbag \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ar_track_alvar-release/archive/release/melodic/ar_track_alvar/0.7.1-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ar_track_alvar"
SRC_URI = "git://github.com/ros-gbp/ar_track_alvar-release;${ROS_BRANCH};protocol=https"
SRCREV = "ec155f44d9ef78e8ef407555c66706fc614ee8d3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

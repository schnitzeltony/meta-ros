# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Package with nodes that facilitate the recording of rosbag files"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "rosbag_uploader"
ROS_BPN = "rosbag_cloud_recorders"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    aws-common \
    aws-ros1-common \
    boost \
    file-uploader-msgs \
    recorder-msgs \
    rosbag-storage \
    roscpp \
    roslint \
    topic-tools \
    xmlrpcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    aws-common \
    aws-ros1-common \
    boost \
    file-uploader-msgs \
    recorder-msgs \
    rosbag-storage \
    roscpp \
    topic-tools \
    xmlrpcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    aws-common \
    aws-ros1-common \
    boost \
    file-uploader-msgs \
    recorder-msgs \
    rosbag-storage \
    roscpp \
    topic-tools \
    xmlrpcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/aws-gbp/rosbag_uploader-release/archive/release/melodic/rosbag_cloud_recorders/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rosbag_cloud_recorders"
SRC_URI = "git://github.com/aws-gbp/rosbag_uploader-release;${ROS_BRANCH};protocol=https"
SRCREV = "fbe07aef5cf2968f5612d0e8566216fa596a3aca"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

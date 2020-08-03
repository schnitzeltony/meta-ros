# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "RaspiMouse ROS 2 node"
AUTHOR = "RT Corporation <shop@rt-net.jp>"
ROS_AUTHOR = "Geoffrey Biggs <git@killbots.net>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "raspimouse2"
ROS_BPN = "raspimouse"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    raspimouse-msgs \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    raspimouse-msgs \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/rt-net/raspimouse2-release/archive/release/dashing/raspimouse/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/raspimouse"
SRC_URI = "git://github.com/rt-net/raspimouse2-release;${ROS_BRANCH};protocol=https"
SRCREV = "58fc459a585cc6b780230ba541f566ac4c2124ba"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Contains messages and services for MAV communication"
AUTHOR = "Rik Bähnemann <brik@ethz.ch>"
ROS_AUTHOR = "Simon Lynen"
HOMEPAGE = "https://github.com/ethz-asl/mav_comm"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "ASL 2.0"
LICENSE = "ASL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

ROS_CN = "mav_comm"
ROS_BPN = "mav_comm"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    mav-msgs \
    mav-planning-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    mav-msgs \
    mav-planning-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ethz-asl/mav_comm-release/archive/release/melodic/mav_comm/3.3.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mav_comm"
SRC_URI = "git://github.com/ethz-asl/mav_comm-release;${ROS_BRANCH};protocol=https"
SRCREV = "1fecb631e67b7e8846e10f6468af8b2587ff60ce"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

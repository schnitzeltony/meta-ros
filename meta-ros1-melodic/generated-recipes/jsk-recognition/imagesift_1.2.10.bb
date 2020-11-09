# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "For every image, computes its sift features and send a new message with the image, its intrinsic parameters, and the features.     Parameters include:     display - shows the image on the local computer"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Rosen Diankov (rdiankov@cs.cmu.edu), Kei Okada"
HOMEPAGE = "http://jsk-docs.readthedocs.io/en/latest/jsk_recognition/doc/imagesift"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_CN = "jsk_recognition"
ROS_BPN = "imagesift"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    cv-bridge \
    image-transport \
    jsk-recognition-utils \
    jsk-topic-tools \
    libsiftfast \
    nodelet \
    posedetection-msgs \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    image-transport \
    jsk-recognition-utils \
    jsk-topic-tools \
    libsiftfast \
    nodelet \
    posedetection-msgs \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    image-transport \
    jsk-recognition-utils \
    jsk-topic-tools \
    libsiftfast \
    nodelet \
    posedetection-msgs \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/imagesift/1.2.10-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/imagesift"
SRC_URI = "git://github.com/tork-a/jsk_recognition-release;${ROS_BRANCH};protocol=https"
SRCREV = "a79d488768c8534dbedbc5394966624772419f1c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

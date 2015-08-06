#comment below line
#include recipes-core/images/core-image-minimal.bb

#uncomment below line
include recipes-fsl/images/fsl-image-multimedia-full.bb


IMAGE_INSTALL += " \
	helloworld \
	gpu-viv-bin-mx6q \
	gpu-viv-bin-mx6q-dev \
	imx-test \
	kernel-dev \
	opencv \
	libopencv-core \
	libopencv-core-dev \
	libopencv-highgui \
	libopencv-highgui-dev \
	libopencv-imgproc \
	libopencv-objdetect \
	libopencv-ml \
	packagegroup-fslc-gstreamer1.0-full \
	gstreamer1.0 \
	gstreamer1.0-plugins-imx \
	gst-plugins-gl \
	gst-plugins-base \
	gst-fsl-plugin \
	gstreamer1.0-omx \
	gst-ffmpeg \
	packagegroup-fsl-gstreamer-full \
	gstreamer1.0-libav \
"

IMAGE_FEATURE += " \
	linux-firmware \
	ssh-server-openssh \
	openssh-sftp-server \
	X11 \
	wayland \
"


export IMAGE_BASENAME = "bmit-voes-image"



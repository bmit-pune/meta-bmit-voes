DESCRIPTION = "simple Hello World program"
PR = "r0"
LICENSE = "GPLv2"

S = "${WORKDIR}"

LIC_FILES_CHKSUM = "file://hello_world.c;md5=7fd4c53c45caecabff42b45a5204546b"
SRC_URI = "file://hello_world.c"

do_compile() {
             ${CC} ${CFLAGS} ${LDFLAGS} -o hello_world hello_world.c
}

do_install() {
             install -d ${D}${bindir}/
             install -m 0755 ${S}/hello_world ${D}${bindir}/
}

FILES_${PN} = "${bindir}/hello_world"

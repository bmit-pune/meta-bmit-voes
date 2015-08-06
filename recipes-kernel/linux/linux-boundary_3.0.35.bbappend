FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
file://Readme \
file://bmitinfo.patch \
"

do_unpack_extra(){
	cp -pPR  Readme ${S}/git/
}

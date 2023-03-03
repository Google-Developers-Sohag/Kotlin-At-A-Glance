function build() {
	build=`pwd`
	root="${build%/*}"
	src=$root'/src'
	ktFiles=`find $src -name '*.kt' -o -name '*.kotlin'`
	echo $ktFiles
	kotlinc-jvm $ktFiles -include-runtime -d $build'/oop-sessions.jar'
return $?
}

build

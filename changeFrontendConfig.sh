#!/bin/bash

if [ -f "ember-flexberry-data/tests/dummy/config/environment.js" ]
then
	back="var testODataServiceURL = 'http://localhost:8080/EmberFlexberryService';"
              
	ifs=$IFS
	IFS=
	findBack=
	notfindedBack=1
	
	while read str
	do
      #  echo "STR=$str"
      case $str in
		*var*testODataServiceURL*=*'http://localhost:6500/odata'*)findBack=1;;	
		*)
			if [ -n "$findBack" ]
			then
				case $str in
					*}*)
					findBack=
					notfindedBack=
					echo  "$back"
					;;
				esac
			else
				case $str in
					*ENV.APP.testODataService*=*!!testODataServiceURL*)
					if [ -n "$notfindedBack" ]
					then
						echo  "$back"
					fi
				esac
				echo $str
			fi			
	  esac
	done < ember-flexberry-data/tests/dummy/config/environment.js > ember-flexberry-data/tests/dummy/config/new_environment.js
    IFS=$ifs
	mv ember-flexberry-data/tests/dummy/config/new_environment.js ember-flexberry-data/tests/dummy/config/environment.js
fi
#!/bin/bash
mkdir bin2
cd bin2
	touch bash
	ln -snf ../sbin/ifconfig ifconfig
cd ..
mkdir usr
cd usr
	mkdir bin
	cd bin
		ln -snf ../../bin2/bash termnal
		ln -snf ../sbin/sh sh
	cd ..
	mkdir sbin
	cd sbin
		touch sh
	cd ..
	ln -snf ../bin2 sysbin
cd ..
mkdir sbin
cd sbin
	touch ifconfig
cd ..

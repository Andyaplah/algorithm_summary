#include <stdio.h>
int get();

#include "get.h"
int get()
{
	return 9988;
}
----------readelf -a-----------------------

ELF Header:
  Magic:   7f 45 4c 46 02 01 01 00 00 00 00 00 00 00 00 00
  Class:                             ELF64
  Data:                              2's complement, little endian
  Version:                           1 (current)
  OS/ABI:                            UNIX - System V
  ABI Version:                       0
  Type:                              REL (Relocatable file)
  Machine:                           AArch64
  Version:                           0x1
  Entry point address:               0x0
  Start of program headers:          0 (bytes into file)
  Start of section headers:          416 (bytes into file)
  Flags:                             0x0
  Size of this header:               64 (bytes)
  Size of program headers:           0 (bytes)
  Number of program headers:         0
  Size of section headers:           64 (bytes)
  Number of section headers:         9
  Section header string table index: 6

Section Headers:
  [Nr] Name              Type             Address           Offset
       Size              EntSize          Flags  Link  Info  Align
  [ 0]                   NULL             0000000000000000  00000000
       0000000000000000  0000000000000000           0     0     0
  [ 1] .text             PROGBITS         0000000000000000  00000040
       0000000000000008  0000000000000000  AX       0     0     4
  [ 2] .data             PROGBITS         0000000000000000  00000048
       0000000000000000  0000000000000000  WA       0     0     1
  [ 3] .bss              NOBITS           0000000000000000  00000048
       0000000000000000  0000000000000000  WA       0     0     1
  [ 4] .comment          PROGBITS         0000000000000000  00000048
       0000000000000028  0000000000000001  MS       0     0     1
  [ 5] .note.GNU-stack   PROGBITS         0000000000000000  00000070
       0000000000000000  0000000000000000           0     0     1
  [ 6] .shstrtab         STRTAB           0000000000000000  00000156
       0000000000000045  0000000000000000           0     0     1
  [ 7] .symtab           SYMTAB           0000000000000000  00000070
       00000000000000d8  0000000000000018           8     8     8
  [ 8] .strtab           STRTAB           0000000000000000  00000148
       000000000000000e  0000000000000000           0     0     1
Key to Flags:
  W (write), A (alloc), X (execute), M (merge), S (strings), I (info),
  L (link order), O (extra OS processing required), G (group), T (TLS),
  C (compressed), x (unknown), o (OS specific), E (exclude),
  p (processor specific)

There are no section groups in this file.

There are no program headers in this file.

There are no relocations in this file.

The decoding of unwind sections for machine type AArch64 is not currently supported.

Symbol table '.symtab' contains 9 entries:
   Num:    Value          Size Type    Bind   Vis      Ndx Name
     0: 0000000000000000     0 NOTYPE  LOCAL  DEFAULT  UND
     1: 0000000000000000     0 FILE    LOCAL  DEFAULT  ABS get.c
     2: 0000000000000000     0 SECTION LOCAL  DEFAULT    1
     3: 0000000000000000     0 SECTION LOCAL  DEFAULT    2
     4: 0000000000000000     0 SECTION LOCAL  DEFAULT    3
     5: 0000000000000000     0 NOTYPE  LOCAL  DEFAULT    1 $x
     6: 0000000000000000     0 SECTION LOCAL  DEFAULT    5
     7: 0000000000000000     0 SECTION LOCAL  DEFAULT    4
     8: 0000000000000000     8 FUNC    GLOBAL DEFAULT    1 get

No version information found in this file.


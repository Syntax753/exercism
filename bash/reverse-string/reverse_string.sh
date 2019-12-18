#!/usr/bin/env bash

set -o errexit
set -o nounset

main() {
  word=$1
  agg=""

  for (( i=${#word}-1; i>=0 ; i-- )); do
    agg="${agg}${word:$i:1}"
  done

  echo "$agg"
}

main "$@"
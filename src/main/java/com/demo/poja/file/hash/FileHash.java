package com.demo.poja.file.hash;

import com.demo.poja.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}

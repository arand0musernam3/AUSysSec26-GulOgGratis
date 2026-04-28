package org.bouncycastle.pqc.crypto.sphincsplus;

/* JADX INFO: loaded from: classes3.dex */
class IndexedDigest {
    final byte[] digest;
    final int idx_leaf;
    final long idx_tree;

    public IndexedDigest(long j9, int i11, byte[] bArr) {
        this.idx_tree = j9;
        this.idx_leaf = i11;
        this.digest = bArr;
    }
}

package org.bouncycastle.math.ec;

/* JADX INFO: loaded from: classes3.dex */
public interface ECLookupTable {
    int getSize();

    ECPoint lookup(int i11);

    ECPoint lookupVar(int i11);
}

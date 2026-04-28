package org.bouncycastle.crypto.threshold;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface SecretSplitter {
    SplitSecret resplit(byte[] bArr, int i11, int i12);

    SplitSecret split(int i11, int i12);

    SplitSecret splitAround(SecretShare secretShare, int i11, int i12) throws IOException;
}

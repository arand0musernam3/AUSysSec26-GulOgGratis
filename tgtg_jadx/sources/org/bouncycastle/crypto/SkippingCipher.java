package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes3.dex */
public interface SkippingCipher {
    long getPosition();

    long seekTo(long j9);

    long skip(long j9);
}

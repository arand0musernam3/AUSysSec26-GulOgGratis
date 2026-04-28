package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public class AFk1pSDK {
    public static void getCurrencyIso4217Code(byte[] bArr, byte b8, long j9) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (((1 << i11) & j9) != 0) {
                bArr[i11] = (byte) (bArr[i11] ^ b8);
            }
        }
    }
}

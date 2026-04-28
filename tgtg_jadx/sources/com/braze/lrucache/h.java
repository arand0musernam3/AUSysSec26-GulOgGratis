package com.braze.lrucache;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f9933a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i11) {
        super(i11);
        this.f9933a = iVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i11 = ((ByteArrayOutputStream) this).count;
        if (i11 > 0) {
            int i12 = i11 - 1;
            if (((ByteArrayOutputStream) this).buf[i12] == 13) {
                i11 = i12;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i11, this.f9933a.f9935b.name());
        } catch (UnsupportedEncodingException e5) {
            i4.a.d(e5);
            return null;
        }
    }
}

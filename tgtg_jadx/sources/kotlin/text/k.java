package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f26609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26613e;

    public k(CharSequence charSequence) {
        charSequence.getClass();
        this.f26609a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11;
        int i12;
        int i13 = this.f26610b;
        if (i13 != 0) {
            return i13 == 1;
        }
        if (this.f26613e < 0) {
            this.f26610b = 2;
            return false;
        }
        CharSequence charSequence = this.f26609a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i14 = this.f26611c; i14 < length2; i14++) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i11 = (cCharAt == '\r' && (i12 = i14 + 1) < charSequence.length() && charSequence.charAt(i12) == '\n') ? 2 : 1;
                length = i14;
                this.f26610b = 1;
                this.f26613e = i11;
                this.f26612d = length;
                return true;
            }
        }
        i11 = -1;
        this.f26610b = 1;
        this.f26613e = i11;
        this.f26612d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i1.c();
            return null;
        }
        this.f26610b = 0;
        int i11 = this.f26612d;
        int i12 = this.f26611c;
        this.f26611c = this.f26613e + i11;
        return this.f26609a.subSequence(i12, i11).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

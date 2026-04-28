package j30;

import c5.i2;
import java.util.Iterator;
import m0.i1;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f24509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24510e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f24513h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f24506a = b.NOT_READY;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24511f = 0;

    public j(i2 i2Var, String str, c cVar) {
        this.f24513h = cVar;
        this.f24509d = (d) i2Var.f7255d;
        this.f24510e = i2Var.f7254c;
        this.f24512g = i2Var.f7253b;
        this.f24508c = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int length;
        String string;
        String str;
        d dVar;
        b bVar = this.f24506a;
        b bVar2 = b.FAILED;
        if (bVar == bVar2) {
            y.e();
            return false;
        }
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        this.f24506a = bVar2;
        int i11 = this.f24511f;
        while (true) {
            length = this.f24511f;
            if (length == -1) {
                this.f24506a = b.DONE;
                string = null;
                break;
            }
            String str2 = this.f24508c;
            int length2 = str2.length();
            na0.a.c0(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (str2.charAt(length) == this.f24513h.f24498f) {
                    break;
                }
                length++;
            }
            str = this.f24508c;
            if (length == -1) {
                length = str.length();
                this.f24511f = -1;
            } else {
                this.f24511f = length + 1;
            }
            int i12 = this.f24511f;
            if (i12 == i11) {
                int i13 = i12 + 1;
                this.f24511f = i13;
                if (i13 > str.length()) {
                    this.f24511f = -1;
                }
            } else {
                dVar = this.f24509d;
                if (i11 < length) {
                    str.charAt(i11);
                    dVar.getClass();
                }
                if (length > i11) {
                    str.charAt(length - 1);
                    dVar.getClass();
                }
                if (!this.f24510e || i11 != length) {
                    break;
                }
                i11 = this.f24511f;
            }
        }
        int i14 = this.f24512g;
        if (i14 == 1) {
            length = str.length();
            this.f24511f = -1;
            if (length > i11) {
                str.charAt(length - 1);
                dVar.getClass();
            }
        } else {
            this.f24512g = i14 - 1;
        }
        string = str.subSequence(i11, length).toString();
        this.f24507b = string;
        if (this.f24506a == b.DONE) {
            return false;
        }
        this.f24506a = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i1.c();
            return null;
        }
        this.f24506a = b.NOT_READY;
        String str = this.f24507b;
        this.f24507b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

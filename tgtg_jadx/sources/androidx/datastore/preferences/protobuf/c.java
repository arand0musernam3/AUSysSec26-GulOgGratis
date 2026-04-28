package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2935a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2936b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2938d;

    public c(com.google.android.gms.internal.measurement.u0 u0Var) {
        this.f2938d = u0Var;
        this.f2937c = u0Var.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2935a) {
            case 0:
                if (this.f2936b < this.f2937c) {
                }
                break;
            case 1:
                if (this.f2936b < this.f2937c) {
                }
                break;
            default:
                if (this.f2936b < this.f2937c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2935a) {
            case 0:
                int i11 = this.f2936b;
                if (i11 >= this.f2937c) {
                    m0.i1.c();
                } else {
                    this.f2936b = i11 + 1;
                }
                break;
            case 1:
                int i12 = this.f2936b;
                if (i12 >= this.f2937c) {
                    m0.i1.c();
                } else {
                    this.f2936b = i12 + 1;
                }
                break;
            default:
                int i13 = this.f2936b;
                if (i13 >= this.f2937c) {
                    m0.i1.c();
                } else {
                    this.f2936b = i13 + 1;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2935a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public c(k00.q0 q0Var) {
        this.f2938d = q0Var;
        this.f2937c = q0Var.e();
    }

    public c(f fVar) {
        this.f2938d = fVar;
        this.f2937c = fVar.size();
    }
}

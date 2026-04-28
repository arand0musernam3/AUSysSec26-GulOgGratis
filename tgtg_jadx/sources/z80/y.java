package z80;

import y80.m1;
import y80.y1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends m1 implements y1 {
    @Override // y80.y1
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f45532h;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f45533i + ((long) ((int) ((o() + ((long) this.f45535k)) - this.f45533i)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void v(int i11) {
        synchronized (this) {
            Object[] objArr = this.f45532h;
            objArr.getClass();
            i(Integer.valueOf(((Number) objArr[((int) ((this.f45533i + ((long) ((int) ((o() + ((long) this.f45535k)) - this.f45533i)))) - 1)) & (objArr.length - 1)]).intValue() + i11));
        }
    }
}

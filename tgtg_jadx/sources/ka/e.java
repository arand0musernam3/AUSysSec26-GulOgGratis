package ka;

import android.database.Cursor;
import com.braze.h2;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f26247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f26248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double[] f26249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f26250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[][] f26251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Cursor f26252i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ja.b bVar, String str) {
        super(bVar, str);
        bVar.getClass();
        str.getClass();
        this.f26247d = new int[0];
        this.f26248e = new long[0];
        this.f26249f = new double[0];
        this.f26250g = new String[0];
        this.f26251h = new byte[0][];
    }

    public static void p(Cursor cursor, int i11) {
        if (i11 < 0 || i11 >= cursor.getColumnCount()) {
            z20.b.E(25, "column index out of range");
            throw null;
        }
    }

    @Override // ha.c
    public final void C(int i11, String str) {
        str.getClass();
        a();
        e(3, i11);
        this.f26247d[i11] = 3;
        this.f26250g[i11] = str;
    }

    @Override // ha.c
    public final String W(int i11) {
        a();
        Cursor cursorR = r();
        p(cursorR, i11);
        String string = cursorR.getString(i11);
        string.getClass();
        return string;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f26255c) {
            n();
            reset();
        }
        this.f26255c = true;
    }

    public final void e(int i11, int i12) {
        int i13 = i12 + 1;
        int[] iArr = this.f26247d;
        if (iArr.length < i13) {
            this.f26247d = Arrays.copyOf(iArr, i13);
        }
        if (i11 == 1) {
            long[] jArr = this.f26248e;
            if (jArr.length < i13) {
                this.f26248e = Arrays.copyOf(jArr, i13);
                return;
            }
            return;
        }
        if (i11 == 2) {
            double[] dArr = this.f26249f;
            if (dArr.length < i13) {
                this.f26249f = Arrays.copyOf(dArr, i13);
                return;
            }
            return;
        }
        if (i11 == 3) {
            String[] strArr = this.f26250g;
            if (strArr.length < i13) {
                this.f26250g = (String[]) Arrays.copyOf(strArr, i13);
                return;
            }
            return;
        }
        if (i11 != 4) {
            return;
        }
        byte[][] bArr = this.f26251h;
        if (bArr.length < i13) {
            this.f26251h = (byte[][]) Arrays.copyOf(bArr, i13);
        }
    }

    @Override // ha.c
    public final void f(int i11, double d3) {
        a();
        e(2, i11);
        this.f26247d[i11] = 2;
        this.f26249f[i11] = d3;
    }

    public final void g() {
        if (this.f26252i == null) {
            this.f26252i = this.f26253a.u(new se.d(this, 25));
        }
    }

    @Override // ha.c
    public final byte[] getBlob(int i11) {
        a();
        Cursor cursorR = r();
        p(cursorR, i11);
        byte[] blob = cursorR.getBlob(i11);
        blob.getClass();
        return blob;
    }

    @Override // ha.c
    public final int getColumnCount() {
        a();
        g();
        Cursor cursor = this.f26252i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // ha.c
    public final String getColumnName(int i11) {
        a();
        g();
        Cursor cursor = this.f26252i;
        if (cursor == null) {
            h2.b("Required value was null.");
            return null;
        }
        p(cursor, i11);
        String columnName = cursor.getColumnName(i11);
        columnName.getClass();
        return columnName;
    }

    @Override // ha.c
    public final double getDouble(int i11) {
        a();
        Cursor cursorR = r();
        p(cursorR, i11);
        return cursorR.getDouble(i11);
    }

    @Override // ha.c
    public final long getLong(int i11) {
        a();
        Cursor cursorR = r();
        p(cursorR, i11);
        return cursorR.getLong(i11);
    }

    @Override // ha.c
    public final boolean isNull(int i11) {
        a();
        Cursor cursorR = r();
        p(cursorR, i11);
        return cursorR.isNull(i11);
    }

    @Override // ha.c
    public final void j(int i11, long j9) {
        a();
        e(1, i11);
        this.f26247d[i11] = 1;
        this.f26248e[i11] = j9;
    }

    @Override // ha.c
    public final void k(int i11, byte[] bArr) {
        bArr.getClass();
        a();
        e(4, i11);
        this.f26247d[i11] = 4;
        this.f26251h[i11] = bArr;
    }

    @Override // ha.c
    public final void m(int i11) {
        a();
        e(5, i11);
        this.f26247d[i11] = 5;
    }

    @Override // ka.g, ha.c
    public final void n() {
        a();
        this.f26247d = new int[0];
        this.f26248e = new long[0];
        this.f26249f = new double[0];
        this.f26250g = new String[0];
        this.f26251h = new byte[0][];
    }

    @Override // ha.c
    public final boolean q0() {
        a();
        g();
        Cursor cursor = this.f26252i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        h2.b("Required value was null.");
        return false;
    }

    public final Cursor r() {
        Cursor cursor = this.f26252i;
        if (cursor != null) {
            return cursor;
        }
        z20.b.E(21, "no row");
        throw null;
    }

    @Override // ka.g, ha.c
    public final void reset() {
        a();
        Cursor cursor = this.f26252i;
        if (cursor != null) {
            cursor.close();
        }
        this.f26252i = null;
    }
}

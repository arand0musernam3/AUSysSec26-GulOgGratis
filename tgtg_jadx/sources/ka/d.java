package ka;

import android.database.sqlite.SQLiteDatabase;
import com.braze.h2;
import ja.j;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26245d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f26246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ja.b bVar, String str) {
        super(bVar, str);
        bVar.getClass();
        str.getClass();
        this.f26246e = bVar.g(str);
    }

    @Override // ha.c
    public final void C(int i11, String str) {
        switch (this.f26245d) {
            case 0:
                str.getClass();
                ((e) this.f26246e).C(i11, str);
                return;
            case 1:
                str.getClass();
                a();
                ((j) this.f26246e).s(i11, str);
                return;
            default:
                str.getClass();
                a();
                z20.b.E(25, "column index out of range");
                throw null;
        }
    }

    @Override // ha.c
    public boolean E() {
        switch (this.f26245d) {
            case 0:
                return ((e) this.f26246e).E();
            default:
                return super.E();
        }
    }

    @Override // ha.c
    public final String W(int i11) {
        switch (this.f26245d) {
            case 0:
                return ((e) this.f26246e).W(i11);
            case 1:
                a();
                z20.b.E(21, "no row");
                throw null;
            default:
                a();
                z20.b.E(21, "no row");
                throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f26245d) {
            case 0:
                ((e) this.f26246e).close();
                break;
            case 1:
                ((j) this.f26246e).close();
                this.f26255c = true;
                break;
            default:
                this.f26255c = true;
                break;
        }
    }

    @Override // ha.c
    public final void f(int i11, double d3) {
        switch (this.f26245d) {
            case 0:
                ((e) this.f26246e).f(i11, d3);
                return;
            case 1:
                a();
                ((j) this.f26246e).f(i11, d3);
                return;
            default:
                a();
                z20.b.E(25, "column index out of range");
                throw null;
        }
    }

    @Override // ha.c
    public final byte[] getBlob(int i11) {
        switch (this.f26245d) {
            case 0:
                return ((e) this.f26246e).getBlob(i11);
            case 1:
                a();
                z20.b.E(21, "no row");
                throw null;
            default:
                a();
                z20.b.E(21, "no row");
                throw null;
        }
    }

    @Override // ha.c
    public final int getColumnCount() {
        switch (this.f26245d) {
            case 0:
                break;
            case 1:
                a();
                break;
            default:
                a();
                break;
        }
        return 0;
    }

    @Override // ha.c
    public final String getColumnName(int i11) {
        switch (this.f26245d) {
            case 0:
                return ((e) this.f26246e).getColumnName(i11);
            case 1:
                a();
                z20.b.E(21, "no row");
                throw null;
            default:
                a();
                z20.b.E(21, "no row");
                throw null;
        }
    }

    @Override // ha.c
    public final double getDouble(int i11) {
        switch (this.f26245d) {
            case 0:
                return ((e) this.f26246e).getDouble(i11);
            case 1:
                a();
                z20.b.E(21, "no row");
                throw null;
            default:
                a();
                z20.b.E(21, "no row");
                throw null;
        }
    }

    @Override // ha.c
    public final long getLong(int i11) {
        switch (this.f26245d) {
            case 0:
                return ((e) this.f26246e).getLong(i11);
            case 1:
                a();
                z20.b.E(21, "no row");
                throw null;
            default:
                a();
                z20.b.E(21, "no row");
                throw null;
        }
    }

    @Override // ha.c
    public final boolean isNull(int i11) {
        switch (this.f26245d) {
            case 0:
                return ((e) this.f26246e).isNull(i11);
            case 1:
                a();
                z20.b.E(21, "no row");
                throw null;
            default:
                a();
                z20.b.E(21, "no row");
                throw null;
        }
    }

    @Override // ha.c
    public final void j(int i11, long j9) {
        switch (this.f26245d) {
            case 0:
                ((e) this.f26246e).j(i11, j9);
                return;
            case 1:
                a();
                ((j) this.f26246e).j(i11, j9);
                return;
            default:
                a();
                z20.b.E(25, "column index out of range");
                throw null;
        }
    }

    @Override // ha.c
    public final void k(int i11, byte[] bArr) {
        switch (this.f26245d) {
            case 0:
                bArr.getClass();
                ((e) this.f26246e).k(i11, bArr);
                return;
            case 1:
                bArr.getClass();
                a();
                ((j) this.f26246e).k(i11, bArr);
                return;
            default:
                bArr.getClass();
                a();
                z20.b.E(25, "column index out of range");
                throw null;
        }
    }

    @Override // ha.c
    public final void m(int i11) {
        switch (this.f26245d) {
            case 0:
                ((e) this.f26246e).m(i11);
                return;
            case 1:
                a();
                ((j) this.f26246e).m(i11);
                return;
            default:
                a();
                z20.b.E(25, "column index out of range");
                throw null;
        }
    }

    @Override // ka.g, ha.c
    public void n() {
        switch (this.f26245d) {
            case 0:
                ((e) this.f26246e).n();
                break;
            case 1:
                a();
                ((j) this.f26246e).n();
                break;
            default:
                super.n();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, u70.j] */
    @Override // ha.c
    public final boolean q0() throws IllegalAccessException, InvocationTargetException {
        switch (this.f26245d) {
            case 0:
                e eVar = (e) this.f26246e;
                boolean zQ0 = eVar.q0();
                boolean zEqualsIgnoreCase = eVar.W(0).equalsIgnoreCase("wal");
                ja.b bVar = this.f26253a;
                if (!zEqualsIgnoreCase) {
                    bVar.f24770a.disableWriteAheadLogging();
                } else {
                    bVar.f24770a.enableWriteAheadLogging();
                }
                break;
            case 1:
                a();
                ((j) this.f26246e).f24791b.execute();
                break;
            default:
                int i11 = f.$EnumSwitchMapping$0[((c) this.f26246e).ordinal()];
                ja.b bVar2 = this.f26253a;
                if (i11 == 1) {
                    bVar2.A();
                    bVar2.p();
                } else if (i11 == 2) {
                    bVar2.p();
                } else if (i11 == 3) {
                    bVar2.a();
                } else if (i11 == 4) {
                    bVar2.e();
                } else if (i11 != 5) {
                    e40.a.f();
                } else {
                    SQLiteDatabase sQLiteDatabase = bVar2.f24770a;
                    ?? r32 = ja.b.f24769e;
                    if (((Method) r32.getValue()) != null) {
                        ?? r42 = ja.b.f24768d;
                        if (((Method) r42.getValue()) != null) {
                            Method method = (Method) r32.getValue();
                            method.getClass();
                            Method method2 = (Method) r42.getValue();
                            method2.getClass();
                            Object objInvoke = method2.invoke(sQLiteDatabase, null);
                            if (objInvoke == null) {
                                h2.b("Required value was null.");
                            } else {
                                method.invoke(objInvoke, 0, null, 0, null);
                            }
                        }
                    }
                    bVar2.a();
                }
                break;
        }
        return false;
    }

    @Override // ka.g, ha.c
    public void reset() {
        switch (this.f26245d) {
            case 0:
                ((e) this.f26246e).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ja.b bVar, String str, e eVar) {
        super(bVar, str);
        bVar.getClass();
        str.getClass();
        this.f26246e = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ja.b bVar, String str, c cVar) {
        super(bVar, str);
        bVar.getClass();
        str.getClass();
        this.f26246e = cVar;
    }
}

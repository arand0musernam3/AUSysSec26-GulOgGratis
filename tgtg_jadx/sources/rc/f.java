package rc;

import ia0.h0;
import ia0.o;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import m90.z0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37887b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f37889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h0 h0Var, Function1 function1) {
        super(h0Var);
        h0Var.getClass();
        this.f37889d = function1;
    }

    @Override // ia0.o, ia0.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        switch (this.f37887b) {
            case 0:
                try {
                    super.close();
                } catch (IOException e5) {
                    this.f37888c = true;
                    ((z0) this.f37889d).invoke(e5);
                    return;
                }
                break;
            default:
                try {
                    super.close();
                } catch (IOException e11) {
                    this.f37888c = true;
                    this.f37889d.invoke(e11);
                }
                break;
        }
    }

    @Override // ia0.o, ia0.h0, java.io.Flushable
    public final void flush() {
        switch (this.f37887b) {
            case 0:
                try {
                    super.flush();
                } catch (IOException e5) {
                    this.f37888c = true;
                    ((z0) this.f37889d).invoke(e5);
                    return;
                }
                break;
            default:
                if (!this.f37888c) {
                    try {
                        super.flush();
                    } catch (IOException e11) {
                        this.f37888c = true;
                        this.f37889d.invoke(e11);
                    }
                    break;
                }
                break;
        }
    }

    @Override // ia0.o, ia0.h0
    public final void x(ia0.g gVar, long j9) throws EOFException {
        switch (this.f37887b) {
            case 0:
                if (this.f37888c) {
                    gVar.skip(j9);
                } else {
                    try {
                        super.x(gVar, j9);
                    } catch (IOException e5) {
                        this.f37888c = true;
                        ((z0) this.f37889d).invoke(e5);
                        return;
                    }
                }
                break;
            default:
                gVar.getClass();
                if (this.f37888c) {
                    gVar.skip(j9);
                } else {
                    try {
                        this.f23668a.x(gVar, j9);
                    } catch (IOException e11) {
                        this.f37888c = true;
                        this.f37889d.invoke(e11);
                    }
                }
                break;
        }
    }

    public f(h0 h0Var, z0 z0Var) {
        super(h0Var);
        this.f37889d = z0Var;
    }
}

package g3;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.b f19810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3.b1 f19812c;

    public y1(bg.b bVar, boolean z11, m3.b1 b1Var) {
        this.f19810a = bVar;
        this.f19811b = z11;
        this.f19812c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((u4.b) obj).f40734a;
        if (u4.c.c(keyEvent) == 1 && (s0.B(keyEvent) || u4.a.a(u4.c.a(keyEvent.getKeyCode()), u4.a.f40724q))) {
            boolean zAreEqual = Intrinsics.areEqual("PrimaryNotEditable", "PrimaryEditable");
            bg.b bVar = this.f19810a;
            if (!zAreEqual) {
                bVar.invoke();
            } else if (s0.B(keyEvent)) {
                bVar.invoke();
                return Boolean.TRUE;
            }
        }
        boolean zAreEqual2 = Intrinsics.areEqual("PrimaryNotEditable", "PrimaryEditable");
        m3.b1 b1Var = this.f19812c;
        if (zAreEqual2 && this.f19811b && (u4.a.a(u4.c.a(keyEvent.getKeyCode()), u4.a.f40723p) || u4.a.a(u4.c.a(keyEvent.getKeyCode()), u4.a.f40713e) || u4.a.a(u4.c.a(keyEvent.getKeyCode()), u4.a.f40712d))) {
            Boolean bool = Boolean.TRUE;
            b1Var.setValue(bool);
            return bool;
        }
        Boolean bool2 = Boolean.FALSE;
        b1Var.setValue(bool2);
        return bool2;
    }
}

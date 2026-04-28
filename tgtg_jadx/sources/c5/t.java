package c5;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f7379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(y yVar, int i11) {
        super(0);
        this.f7378a = i11;
        this.f7379b = yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int actionMasked;
        switch (this.f7378a) {
            case 0:
                return d2.a(this.f7379b);
            case 1:
                y yVar = this.f7379b;
                MotionEvent motionEvent = yVar.A1;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    yVar.B1 = SystemClock.uptimeMillis();
                    yVar.post(yVar.G1);
                }
                return Unit.f26487a;
            default:
                return this.f7379b.get_viewTreeOwners();
        }
    }
}

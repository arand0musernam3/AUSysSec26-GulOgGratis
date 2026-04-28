package nv;

import a3.v0;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import m3.l0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f31408b;

    public /* synthetic */ d(int i11, View view) {
        this.f31407a = i11;
        this.f31408b = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewParent parent;
        switch (this.f31407a) {
            case 0:
                ((l0) obj).getClass();
                View view = this.f31408b;
                view.setKeepScreenOn(true);
                return new v0(view, 14);
            case 1:
                ((Context) obj).getClass();
                return this.f31408b;
            case 2:
                MotionEvent motionEvent = (MotionEvent) obj;
                motionEvent.getClass();
                int action = motionEvent.getAction();
                View view2 = this.f31408b;
                if (action == 0) {
                    ViewParent parent2 = view2.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                } else if ((action == 1 || action == 3) && (parent = view2.getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                return Boolean.FALSE;
            default:
                ((Context) obj).getClass();
                return this.f31408b;
        }
    }
}

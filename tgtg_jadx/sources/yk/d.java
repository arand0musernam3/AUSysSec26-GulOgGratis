package yk;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import zendesk.ui.android.conversation.form.FormViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f46123b;

    public /* synthetic */ d(int i11, Function0 function0) {
        this.f46122a = i11;
        this.f46123b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f46122a) {
            case 0:
                this.f46123b.invoke();
                return Unit.f26487a;
            case 1:
                Function0 function0 = this.f46123b;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f26487a;
            case 2:
                return FormViewKt.withSelectCheckMarkActionInterceptor$lambda$1(this.f46123b);
            default:
                this.f46123b.invoke();
                return Unit.f26487a;
        }
    }
}

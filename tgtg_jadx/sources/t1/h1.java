package t1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.messagingscreen.MessagingActivity;
import zendesk.ui.android.conversation.form.FormViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f39455b;

    public /* synthetic */ h1(Function1 function1, int i11) {
        this.f39454a = i11;
        this.f39455b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f39454a) {
            case 0:
                Function1 function1 = this.f39455b;
                Long l = (Long) obj;
                l.getClass();
                return function1.invoke(l);
            case 1:
                Function1 function12 = this.f39455b;
                String str = (String) obj;
                str.getClass();
                function12.invoke(str);
                return Unit.f26487a;
            case 2:
                Function1 function13 = this.f39455b;
                op.c cVar = (op.c) obj;
                cVar.getClass();
                function13.invoke(cVar);
                return Unit.f26487a;
            case 3:
                Function1 function14 = this.f39455b;
                op.l lVar = (op.l) obj;
                lVar.getClass();
                function14.invoke(lVar);
                return Unit.f26487a;
            case 4:
                Function1 function15 = this.f39455b;
                String str2 = (String) obj;
                str2.getClass();
                function15.invoke(str2);
                return Unit.f26487a;
            case 5:
                Function1 function16 = this.f39455b;
                Integer num = (Integer) obj;
                num.intValue();
                if (function16 != null) {
                    function16.invoke(num);
                }
                return Unit.f26487a;
            case 6:
                z3.g gVar = (z3.g) this.f39455b.invoke((z3.k) obj);
                synchronized (z3.l.f47038c) {
                    z3.l.f47039d = z3.l.f47039d.h(gVar.g());
                }
                return gVar;
            case 7:
                return MessagingActivity.launchSinglePermissionRequest$lambda$4(this.f39455b, ((Boolean) obj).booleanValue());
            case 8:
                return FormViewKt.withStateFocusChanged$lambda$2(this.f39455b, ((Boolean) obj).booleanValue());
            case 9:
                return FormViewKt.withStateFocusChanged$lambda$3(this.f39455b, ((Boolean) obj).booleanValue());
            default:
                return FormViewKt.withStateFocusChanged$lambda$4(this.f39455b, ((Boolean) obj).booleanValue());
        }
    }
}

package m5;

import android.graphics.Path;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zendesk.ui.android.common.buttonbanner.ButtonBannerRendering;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29616d;

    public /* synthetic */ q(Object obj, int i11, int i12, int i13) {
        this.f29613a = i13;
        this.f29616d = obj;
        this.f29614b = i11;
        this.f29615c = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f29613a) {
            case 0:
                i4.h hVar = (i4.h) this.f29616d;
                t tVar = (t) obj;
                b bVar = tVar.f29641a;
                int iD = tVar.d(this.f29614b);
                int iD2 = tVar.d(this.f29615c);
                CharSequence charSequence = bVar.f29515e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbR = r8.k.r(iD, iD2, "start(", ") or end(", ") is out of range [0..");
                    sbR.append(charSequence.length());
                    sbR.append("], or start > end!");
                    s5.a.a(sbR.toString());
                }
                Path path = new Path();
                n5.i iVar = bVar.f29514d;
                iVar.f30531f.getSelectionPath(iD, iD2, path);
                int i11 = iVar.f30533h;
                if (i11 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i11);
                }
                i4.h hVar2 = new i4.h(path);
                hVar2.j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(tVar.f29646f)) & 4294967295L));
                i4.h.a(hVar, hVar2);
                return Unit.f26487a;
            default:
                return MessageLogView.showNewMessagesViewIfNeeded$lambda$23((MessageLogView) this.f29616d, this.f29614b, this.f29615c, (ButtonBannerRendering) obj);
        }
    }
}

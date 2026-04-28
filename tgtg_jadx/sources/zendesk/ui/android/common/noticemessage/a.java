package zendesk.ui.android.common.noticemessage;

import b4.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import zendesk.ui.android.conversation.activitymessage.ActivityMessageKt;
import zendesk.ui.android.conversations.informationbanner.InformationBannerKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f47792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f47793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f47794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f47795f;

    public /* synthetic */ a(a3.t tVar, t tVar2, long j9, int i11, int i12) {
        this.f47790a = 3;
        this.f47791b = tVar;
        this.f47793d = tVar2;
        this.f47792c = j9;
        this.f47794e = i11;
        this.f47795f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f47790a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return NoticeMessageKt.NoticeMessage_3IgeMak$lambda$3((String) this.f47791b, this.f47792c, this.f47793d, this.f47794e, this.f47795f, (n) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ActivityMessageKt.ActivityMessage_3IgeMak$lambda$0((String) this.f47791b, this.f47792c, this.f47793d, this.f47794e, this.f47795f, (n) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return InformationBannerKt.InformationBanner_3IgeMak$lambda$0((String) this.f47791b, this.f47792c, this.f47793d, this.f47794e, this.f47795f, (n) obj, iIntValue3);
            default:
                ((Integer) obj2).getClass();
                m2.a.a((a3.t) this.f47791b, this.f47793d, this.f47792c, (n) obj, i.F(this.f47794e | 1), this.f47795f);
                return Unit.f26487a;
        }
    }

    public /* synthetic */ a(String str, long j9, t tVar, int i11, int i12, int i13) {
        this.f47790a = i13;
        this.f47791b = str;
        this.f47792c = j9;
        this.f47793d = tVar;
        this.f47794e = i11;
        this.f47795f = i12;
    }
}

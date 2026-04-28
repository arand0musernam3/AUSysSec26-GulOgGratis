package sr;

import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f39125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ContactUsViewModel f39126k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ContactUsViewModel contactUsViewModel, z70.c cVar) {
        super(cVar);
        this.f39126k = contactUsViewModel;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f39125j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f39126k.h(this);
    }
}

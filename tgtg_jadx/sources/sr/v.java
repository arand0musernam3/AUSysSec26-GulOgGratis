package sr;

import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f39122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f39123k;
    public final /* synthetic */ ContactUsViewModel l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f39124m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ContactUsViewModel contactUsViewModel, z70.c cVar) {
        super(cVar);
        this.l = contactUsViewModel;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f39123k = obj;
        this.f39124m |= Integer.MIN_VALUE;
        return ContactUsViewModel.b(this.l, null, this);
    }
}

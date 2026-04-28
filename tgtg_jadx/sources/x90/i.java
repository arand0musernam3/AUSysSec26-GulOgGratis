package x90;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import zendesk.ui.android.conversation.form.DisplayedField;
import zendesk.ui.android.conversation.form.FormView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44119a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f44120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f44122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f44123e;

    public /* synthetic */ i(n nVar, int i11, ia0.g gVar, int i12, boolean z11) {
        this.f44122d = nVar;
        this.f44120b = i11;
        this.f44123e = gVar;
        this.f44121c = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44119a) {
            case 0:
                n nVar = (n) this.f44122d;
                int i11 = this.f44120b;
                ia0.g gVar = (ia0.g) this.f44123e;
                int i12 = this.f44121c;
                try {
                    nVar.f44142k.getClass();
                    gVar.skip(i12);
                    nVar.f44153w.u(i11, b.CANCEL);
                    synchronized (nVar) {
                        nVar.f44155y.remove(Integer.valueOf(i11));
                    }
                } catch (IOException unused) {
                }
                return Unit.f26487a;
            default:
                return FormView.addFieldView$lambda$15((FormView) this.f44122d, this.f44120b, (DisplayedField) this.f44123e, this.f44121c);
        }
    }

    public /* synthetic */ i(FormView formView, int i11, DisplayedField displayedField, int i12) {
        this.f44122d = formView;
        this.f44120b = i11;
        this.f44123e = displayedField;
        this.f44121c = i12;
    }
}

package c1;

import com.braze.ui.contentcards.adapters.ContentCardAdapter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6888a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6891d;

    public /* synthetic */ l(int i11, int i12, ContentCardAdapter contentCardAdapter) {
        this.f6889b = i11;
        this.f6890c = i12;
        this.f6891d = contentCardAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z11;
        switch (this.f6888a) {
            case 0:
                n nVar = (n) this.f6891d;
                int i11 = nVar.f6904i;
                int i12 = this.f6889b;
                boolean z12 = true;
                if (i11 != i12) {
                    nVar.f6904i = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i13 = nVar.f6903h;
                int i14 = this.f6890c;
                if (i13 != i14) {
                    nVar.f6903h = i14;
                } else {
                    z12 = z11;
                }
                if (z12) {
                    nVar.e();
                }
                break;
            default:
                ContentCardAdapter.markOnScreenCardsAsRead$lambda$6(this.f6889b, this.f6890c, (ContentCardAdapter) this.f6891d);
                break;
        }
    }

    public /* synthetic */ l(n nVar, int i11, int i12) {
        this.f6891d = nVar;
        this.f6889b = i11;
        this.f6890c = i12;
    }
}

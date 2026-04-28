package hm;

import com.app.tgtg.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f22125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ MainActivity f22126k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(MainActivity mainActivity, z70.c cVar) {
        super(cVar);
        this.f22126k = mainActivity;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f22125j = obj;
        this.l |= Integer.MIN_VALUE;
        return MainActivity.b0(this.f22126k, this);
    }
}

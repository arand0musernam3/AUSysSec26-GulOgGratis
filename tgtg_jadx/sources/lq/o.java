package lq;

import android.view.View;
import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28151a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f28152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicItem f28153c;

    public /* synthetic */ o(BasicItem basicItem, p pVar) {
        this.f28153c = basicItem;
        this.f28152b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28151a) {
            case 0:
                return p.d(this.f28153c, this.f28152b, ((Boolean) obj).booleanValue());
            default:
                return p.e(this.f28152b, this.f28153c, (View) obj);
        }
    }

    public /* synthetic */ o(p pVar, BasicItem basicItem) {
        this.f28152b = pVar;
        this.f28153c = basicItem;
    }
}

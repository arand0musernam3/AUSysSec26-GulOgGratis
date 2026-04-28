package t8;

import ag.g;
import ag.i;
import android.content.Context;
import androidx.work.WorkerParameters;
import ao.h;
import ao.m0;
import com.app.tgtg.favWidget.WidgetUpdateWorker;
import com.app.tgtg.feature.recipegenerator.network.RecipeGeneratorPollingHelper;
import com.app.tgtg.services.user.AuthPolling;
import com.app.tgtg.tasks.EventWorker;
import com.app.tgtg.tasks.RedeemWorker;
import et.z;
import ib.v;
import jp.q;
import k30.c0;
import lx.u;
import rg.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f39839e;

    public a(c0 c0Var) {
        this.f39839e = c0Var;
    }

    @Override // lx.u
    public final v z(Context context, String str, WorkerParameters workerParameters) {
        t70.a aVar = (t70.a) this.f39839e.get(str);
        if (aVar == null) {
            return null;
        }
        g gVar = (g) aVar.get();
        switch (gVar.f1302a) {
            case 0:
                i iVar = (i) gVar.f1303b.f1306c;
                return new AuthPolling(context, workerParameters, (ao.v) iVar.f1341q.get(), (h) iVar.X.get());
            case 1:
                return new EventWorker(context, workerParameters, (m0) ((i) gVar.f1303b.f1306c).R.get());
            case 2:
                return new RecipeGeneratorPollingHelper(context, workerParameters, (q) ((i) gVar.f1303b.f1306c).f1311b0.get());
            case 3:
                return new RedeemWorker(context, workerParameters, (z) ((i) gVar.f1303b.f1306c).O.get());
            default:
                return new WidgetUpdateWorker(context, workerParameters, (w) ((i) gVar.f1303b.f1306c).V.get());
        }
    }
}

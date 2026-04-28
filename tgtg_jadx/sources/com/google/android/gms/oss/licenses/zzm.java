package com.google.android.gms.oss.licenses;

import a8.h;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import c9.b;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.w5;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d10.i;
import d10.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import pd.g;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzm extends b {
    private List zza;
    private final zze zzb;

    public zzm(Context context, zze zzeVar) {
        super(context.getApplicationContext());
        this.zzb = zzeVar;
    }

    @Override // c9.e
    public final /* synthetic */ void deliverResult(Object obj) {
        List list = (List) obj;
        this.zza = list;
        super.deliverResult(list);
    }

    @Override // c9.b
    public final Object loadInBackground() {
        ArrayList arrayListO = g.O(getContext(), R.raw.keep_third_party_licenses);
        zzk zzkVarZzc = this.zzb.zzc();
        Task taskDoRead = zzkVarZzc.doRead(new zzj(zzkVarZzc, arrayListO));
        i0.i(taskDoRead, "Task must not be null");
        i0.i(TimeUnit.SECONDS, "TimeUnit must not be null");
        se.b bVar = new se.b(13);
        d10.g gVar = new d10.g(bVar);
        w5 w5Var = new w5(Looper.getMainLooper(), 5);
        w5Var.postDelayed(new i(0, gVar), ConversationFragment.COORDINATOR_INITIALIZATION_TIMEOUT);
        taskDoRead.addOnCompleteListener(new h(w5Var, gVar, bVar, 18));
        o oVar = gVar.f13697a;
        try {
            Tasks.await(oVar);
            return oVar.isSuccessful() ? (List) oVar.getResult() : arrayListO;
        } catch (InterruptedException | ExecutionException e5) {
            Log.w("OssLicensesLoader", "Error getting license list from service: ".concat(String.valueOf(e5.getMessage())));
            return arrayListO;
        }
    }

    @Override // c9.e
    public final void onStartLoading() {
        List list = this.zza;
        if (list != null) {
            super.deliverResult(list);
        } else {
            forceLoad();
        }
    }

    @Override // c9.e
    public final void onStopLoading() {
        cancelLoad();
    }
}

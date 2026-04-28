package com.app.tgtg.favWidget;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ib.h;
import ib.r;
import ib.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rg.w;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/app/tgtg/favWidget/WidgetUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lrg/w;", "updateManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lrg/w;)V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WidgetUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f8954g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetUpdateWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull w wVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        wVar.getClass();
        this.f8954g = wVar;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object d(c cVar) {
        String strA = this.f23761b.f4147b.a("type");
        if (strA == null) {
            return new r();
        }
        this.f8954g.a(strA);
        return new t(h.f23726b);
    }
}

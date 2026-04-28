package com.braze.images;

import a90.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.widget.ImageView;
import com.braze.Constants;
import com.braze.R;
import com.braze.enums.BrazeViewBounds;
import com.braze.h2;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v80.b0;
import v80.f0;
import v80.p0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f9872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultBrazeImageLoader f9874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f9875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f9876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BrazeViewBounds f9877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ImageView f9878g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DefaultBrazeImageLoader defaultBrazeImageLoader, Context context, String str, BrazeViewBounds brazeViewBounds, ImageView imageView, x70.c cVar) {
        super(2, cVar);
        this.f9874c = defaultBrazeImageLoader;
        this.f9875d = context;
        this.f9876e = str;
        this.f9877f = brazeViewBounds;
        this.f9878g = imageView;
    }

    public static final String a(String str) {
        return e0.f.k("Failed to retrieve bitmap from url: ", str);
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new g(this.f9874c, this.f9875d, this.f9876e, this.f9877f, this.f9878g, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f9873b;
        if (i11 == 0) {
            ba0.g.M(obj);
            TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
            Bitmap bitmapFromUrl = this.f9874c.getBitmapFromUrl(this.f9875d, this.f9876e, this.f9877f);
            if (bitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xv.a(this.f9876e, 2), 14, (Object) null);
            } else {
                String str = this.f9876e;
                Object tag = this.f9878g.getTag(R.string.com_braze_image_lru_cache_image_url_key);
                tag.getClass();
                if (Intrinsics.areEqual(str, (String) tag)) {
                    c90.f fVar = p0.f42144a;
                    w80.c cVar = p.f1044a;
                    e eVar = new e(this.f9878g, bitmapFromUrl, null);
                    this.f9872a = bitmapFromUrl;
                    this.f9873b = 1;
                    if (f0.K(cVar, eVar, this) == aVar) {
                        return aVar;
                    }
                    bitmap = bitmapFromUrl;
                }
            }
            return Unit.f26487a;
        }
        if (i11 != 1) {
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bitmap = this.f9872a;
        ba0.g.M(obj);
        BrazeViewBounds brazeViewBounds = this.f9877f;
        ImageView imageView = this.f9878g;
        imageView.addOnLayoutChangeListener(new f(brazeViewBounds, imageView, bitmap));
        return Unit.f26487a;
    }
}

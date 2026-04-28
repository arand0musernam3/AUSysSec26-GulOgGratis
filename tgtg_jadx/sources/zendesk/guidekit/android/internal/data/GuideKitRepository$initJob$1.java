package zendesk.guidekit.android.internal.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.guidekit.android.internal.data.GuideKitRepository$initJob$1", f = "GuideKitRepository.kt", l = {53, 57}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class GuideKitRepository$initJob$1 extends i implements Function2<b0, c<? super Unit>, Object> {
    int label;
    final /* synthetic */ GuideKitRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideKitRepository$initJob$1(GuideKitRepository guideKitRepository, c<? super GuideKitRepository$initJob$1> cVar) {
        super(2, cVar);
        this.this$0 = guideKitRepository;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new GuideKitRepository$initJob$1(this.this$0, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
        return ((GuideKitRepository$initJob$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r1.saveBrand(r7, r6) == r0) goto L26;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            r4 = 0
            java.lang.String r5 = "GuideKitRepository"
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L19
            ba0.g.M(r7)     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            goto L78
        L13:
            r7 = move-exception
            goto L61
        L15:
            r7 = move-exception
            goto L69
        L17:
            r7 = move-exception
            goto L71
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L20:
            ba0.g.M(r7)     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            goto L40
        L24:
            ba0.g.M(r7)
            zendesk.guidekit.android.internal.data.GuideKitRepository r7 = r6.this$0
            zendesk.guidekit.android.model.GuideKitSettings r7 = zendesk.guidekit.android.internal.data.GuideKitRepository.access$getGuideKitSettings$p(r7)
            java.lang.String r7 = r7.getChannelId$zendesk_guidekit_guidekit_android()
            zendesk.guidekit.android.internal.data.GuideKitRepository r1 = r6.this$0     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            zendesk.guidekit.android.internal.rest.BrandsApi r1 = zendesk.guidekit.android.internal.data.GuideKitRepository.access$getBrandsApi$p(r1)     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            r6.label = r3     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            java.lang.Object r7 = r1.getBrands(r7, r6)     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            if (r7 != r0) goto L40
            goto L60
        L40:
            zendesk.guidekit.android.internal.rest.model.BrandsDto r7 = (zendesk.guidekit.android.internal.rest.model.BrandsDto) r7     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            java.util.List r7 = r7.getBrands()     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            java.lang.Object r7 = kotlin.collections.CollectionsKt.firstOrNull(r7)     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            zendesk.guidekit.android.internal.rest.model.BrandDto r7 = (zendesk.guidekit.android.internal.rest.model.BrandDto) r7     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            if (r7 == 0) goto L78
            zendesk.guidekit.android.internal.data.GuideKitRepository r1 = r6.this$0     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource r1 = zendesk.guidekit.android.internal.data.GuideKitRepository.access$getBrandsInMemoryDataSource$p(r1)     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            zendesk.guidekit.android.model.Brand r7 = zendesk.guidekit.android.internal.data.mapper.BrandsMapperKt.toBrand(r7)     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            r6.label = r2     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            java.lang.Object r7 = r1.saveBrand(r7, r6)     // Catch: java.io.IOException -> L13 kotlinx.serialization.SerializationException -> L15 retrofit2.HttpException -> L17
            if (r7 != r0) goto L78
        L60:
            return r0
        L61:
            java.lang.String r0 = "IOException when fetching the brand"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            zendesk.logger.Logger.e(r5, r0, r7, r1)
            goto L78
        L69:
            java.lang.String r0 = "Json serialization when fetching the brand"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            zendesk.logger.Logger.e(r5, r0, r7, r1)
            goto L78
        L71:
            java.lang.String r0 = "HttpException when fetching the brand"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            zendesk.logger.Logger.e(r5, r0, r7, r1)
        L78:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.guidekit.android.internal.data.GuideKitRepository$initJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

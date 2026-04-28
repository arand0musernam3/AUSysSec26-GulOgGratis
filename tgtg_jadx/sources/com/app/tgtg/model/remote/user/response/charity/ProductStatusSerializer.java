package com.app.tgtg.model.remote.user.response.charity;

import i90.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import ox.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0080\u0004J\u0012\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\b\u001a\u00020\tX\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/ProductStatusSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/ProductStatus;", "<init>", "()V", "serialNameMap", "", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProductStatusSerializer implements KSerializer {

    @NotNull
    public static final ProductStatusSerializer INSTANCE = new ProductStatusSerializer();

    @NotNull
    private static final Map<String, ProductStatus> serialNameMap = x0.e(new Pair("ADDED", ProductStatus.ADDED), new Pair("REMOVED", ProductStatus.REMOVED), new Pair("QUANTITY_CHANGED", ProductStatus.QUANTITY));

    @NotNull
    private static final SerialDescriptor descriptor = h.g("ProductStatus");
    public static final int $stable = 8;

    private ProductStatusSerializer() {
    }

    @Override // i90.b
    @NotNull
    public ProductStatus deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        ProductStatus productStatus = serialNameMap.get(decoder.r());
        return productStatus == null ? ProductStatus.UNKNOWN : productStatus;
    }

    @Override // i90.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull ProductStatus value) {
        String strName;
        encoder.getClass();
        value.getClass();
        Class<ProductStatus> declaringClass = value.getDeclaringClass();
        declaringClass.getClass();
        g gVar = (g) declaringClass.getField(value.name()).getAnnotation(g.class);
        if (gVar == null || (strName = gVar.value()) == null) {
            strName = value.name();
        }
        encoder.D(strName);
    }
}

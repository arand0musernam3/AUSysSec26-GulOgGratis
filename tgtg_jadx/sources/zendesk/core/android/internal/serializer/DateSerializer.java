package zendesk.core.android.internal.serializer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import ox.h;
import zendesk.core.android.internal.DateKtxConstants;
import zendesk.core.android.internal.InternalZendeskApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@InternalZendeskApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lzendesk/core/android/internal/serializer/DateSerializer;", "Lkotlinx/serialization/KSerializer;", "Ljava/util/Date;", "<init>", "()V", "iso8601Format", "Ljava/text/SimpleDateFormat;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "zendesk.core_core-utilities"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DateSerializer implements KSerializer {

    @NotNull
    public static final DateSerializer INSTANCE = new DateSerializer();

    @NotNull
    private static final SerialDescriptor descriptor;

    @NotNull
    private static final SimpleDateFormat iso8601Format;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE));
        iso8601Format = simpleDateFormat;
        descriptor = h.g("Date");
    }

    private DateSerializer() {
    }

    @Override // i90.b
    @NotNull
    public Date deserialize(@NotNull Decoder decoder) {
        Date date;
        decoder.getClass();
        String strR = decoder.r();
        SimpleDateFormat simpleDateFormat = iso8601Format;
        synchronized (simpleDateFormat) {
            date = simpleDateFormat.parse(strR);
            if (date == null) {
                date = new Date();
            }
        }
        return date;
    }

    @Override // i90.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull Date value) {
        String str;
        encoder.getClass();
        value.getClass();
        SimpleDateFormat simpleDateFormat = iso8601Format;
        synchronized (simpleDateFormat) {
            str = simpleDateFormat.format(value);
        }
        str.getClass();
        encoder.D(str);
    }
}

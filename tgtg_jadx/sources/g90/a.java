package g90;

import com.braze.Constants;
import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lg90/a;", "", "<init>", "()V", "Lg90/b;", "b", "()Lg90/b;", "", "isoString", "c", "(Ljava/lang/String;)Lg90/b;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "kotlinx-datetime"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlinx/datetime/Instant$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,190:1\n163#2,6:191\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlinx/datetime/Instant$Companion\n*L\n80#1:191,6\n*E\n"})
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a(String isoString) {
        int iF = StringsKt.F(isoString, 'T', 0, true, 2);
        if (iF != -1) {
            int length = isoString.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    char cCharAt = isoString.charAt(length);
                    if (cCharAt == '+' || cCharAt == '-') {
                        break;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                }
                length = -1;
                if (length >= iF && StringsKt.F(isoString, ':', length, false, 4) == -1) {
                    return isoString.concat(":00");
                }
            } else {
                length = -1;
                if (length >= iF) {
                    return isoString.concat(":00");
                }
            }
        }
        return isoString;
    }

    @d
    @NotNull
    public final b b() {
        Instant instant = Clock.systemUTC().instant();
        instant.getClass();
        return new b(instant);
    }

    @NotNull
    public final b c(@NotNull String isoString) {
        isoString.getClass();
        try {
            Instant instant = OffsetDateTime.parse(a(isoString)).toInstant();
            instant.getClass();
            return new b(instant);
        } catch (DateTimeParseException e5) {
            throw new DateTimeFormatException(e5);
        }
    }

    @NotNull
    public final KSerializer serializer() {
        return h90.a.f21671a;
    }

    public a() {
    }
}

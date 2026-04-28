package org.bouncycastle.asn1;

import i4.a;
import java.io.IOException;
import java.io.InputStream;
import wy.o;

/* JADX INFO: loaded from: classes3.dex */
class ConstructedBitStream extends InputStream {
    private ASN1BitStringParser _currentParser;
    private InputStream _currentStream;
    private final boolean _octetAligned;
    private final ASN1StreamParser _parser;
    private boolean _first = true;
    private int _padBits = 0;

    public ConstructedBitStream(ASN1StreamParser aSN1StreamParser, boolean z11) {
        this._parser = aSN1StreamParser;
        this._octetAligned = z11;
    }

    private ASN1BitStringParser getNextParser() throws IOException {
        ASN1Encodable object = this._parser.readObject();
        if (object == null) {
            if (!this._octetAligned || this._padBits == 0) {
                return null;
            }
            o.e(this._padBits, "expected octet-aligned bitstring, but found padBits: ");
            return null;
        }
        if (!(object instanceof ASN1BitStringParser)) {
            o.o(object.getClass(), "unknown object encountered: ");
            return null;
        }
        if (this._padBits == 0) {
            return (ASN1BitStringParser) object;
        }
        a.k("only the last nested bitstring can have padding");
        return null;
    }

    public int getPadBits() {
        return this._padBits;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        if (this._currentStream == null) {
            if (!this._first) {
                return -1;
            }
            ASN1BitStringParser nextParser = getNextParser();
            this._currentParser = nextParser;
            if (nextParser == null) {
                return -1;
            }
            this._first = false;
            this._currentStream = nextParser.getBitStream();
        }
        while (true) {
            int i14 = this._currentStream.read(bArr, i11 + i13, i12 - i13);
            if (i14 >= 0) {
                i13 += i14;
                if (i13 == i12) {
                    return i13;
                }
            } else {
                this._padBits = this._currentParser.getPadBits();
                ASN1BitStringParser nextParser2 = getNextParser();
                this._currentParser = nextParser2;
                if (nextParser2 == null) {
                    this._currentStream = null;
                    if (i13 < 1) {
                        return -1;
                    }
                    return i13;
                }
                this._currentStream = nextParser2.getBitStream();
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this._currentStream == null) {
            if (!this._first) {
                return -1;
            }
            ASN1BitStringParser nextParser = getNextParser();
            this._currentParser = nextParser;
            if (nextParser == null) {
                return -1;
            }
            this._first = false;
            this._currentStream = nextParser.getBitStream();
        }
        while (true) {
            int i11 = this._currentStream.read();
            if (i11 >= 0) {
                return i11;
            }
            this._padBits = this._currentParser.getPadBits();
            ASN1BitStringParser nextParser2 = getNextParser();
            this._currentParser = nextParser2;
            if (nextParser2 == null) {
                this._currentStream = null;
                return -1;
            }
            this._currentStream = nextParser2.getBitStream();
        }
    }
}

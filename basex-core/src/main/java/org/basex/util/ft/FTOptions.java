package org.basex.util.ft;

import org.basex.core.*;
import org.basex.util.options.*;

/**
 * Full-text options.
 *
 * @author BaseX Team 2005-12, BSD License
 * @author Christian Gruen
 */
public final class FTOptions extends Options {
  /** Option: fuzzy. */
  public static final BooleanOption FUZZY = new BooleanOption("fuzzy", false);
  /** Option: wildcards. */
  public static final BooleanOption WILDCARDS = new BooleanOption("wildcards", false);
  /** Option: wildcards. */
  public static final StringOption MODE = new StringOption("mode", "any");
  /** Option: distance. */
  public static final StringOption DISTANCE = new StringOption("distance");

  /**
   * Constructor.
   */
  public FTOptions() {
    super();
  }

  /**
   * Constructor, specifying initial options.
   * @param opts options string
   * @throws BaseXException database exception
   */
  public FTOptions(final String opts) throws BaseXException {
    super(opts);
  }
}
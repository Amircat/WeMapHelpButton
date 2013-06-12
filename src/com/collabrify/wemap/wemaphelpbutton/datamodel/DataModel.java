package com.collabrify.wemap.wemaphelpbutton.datamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DataModel
{

  /**
   * An array of items.
   */
  public static List<HowToItem> ITEMS = new ArrayList<HowToItem>();

  /**
   * A map of items, by ID.
   */
  public static Map<String, HowToItem> ITEM_MAP = new HashMap<String, HowToItem>();

  static
  {
    // This where we populate the list with our instructions. Each item is a task.
    addItem(new HowToItem("1", "Add a Node", "1.  Touch the grid with your finger and draw a circle where you would like to create the node. The “create node” menu will pop up.\n\n2.  Insert the node's name in the “Name:” field.\n\n3.  Add any relevant notes for the node in the “Notes:” field.\n\n4.  Select the node’s color by touching the “Color” drop down menu. A list of colors should appear. Touch the desired color.\n\n5.  Touch the Add button to add the node to the map."));
    addItem(new HowToItem("2", "Edit a Node", "1.  Touch the node that you wish to edit. The “edit node” menu will pop up.\n\n2.  Modify the “Name:”, “Notes:”, and “Color:” fields as desired.\n\n3.  Touch the Save button to save the changes you have made. Touch outside the “edit node” menu if you would NOT like to save the changes you have made."));
    addItem(new HowToItem("3", "Delete a Node", "1.  Touch the node that you wish to delete. The “edit node” menu will pop up.\n\n2.  Touch the Delete button. A warning will pop up. Touch “Yes” to delete the selected node. Touch “No” to return to the “edit node” menu.\n\nNOTE: Deleting a node will also delete any links to that node."));
    addItem(new HowToItem("4", "Add a Link", "1.  Draw a line between the two nodes that you wish to link. The “create link” menu will pop up.\n\n2.  Touch the Link Direction Toggle button to set the arrow direction.\n\n3.  Insert the link’s name in the “Name:” field.\n\n4.  Insert any relevant notes for the link in the “Notes:” field.\n\n5.  Touch the Add button to add the link to the map.\n\nNOTE: Links that have notes will be red."));
    addItem(new HowToItem("5", "Edit a Link", "1.  To select the link that you would like to edit, draw a line connecting the two nodes that the link connects. The “edit link” menu will pop up.\n\n2.  Modify the Direction, “Name:”, and “Notes:” fields as desired.\n\n3.  Touch the Save button to save the changes you have made. Touch outside the “edit link” menu if you would NOT like to save the changes you have made."));
    addItem(new HowToItem("6", "Delete a Link", "1.  To select the link that you would like to edit, draw a line connecting the two nodes that the link connects. The “edit link” menu will pop up.\n\n2.  Touch the Delete button."));
    addItem(new HowToItem("7", "Move a Node", "Touch anywhere inside the node and drag you finger to the desired location."));
    addItem(new HowToItem("8", "Pan Across the Map", "Touch the map with two fingers and drag them along the grid to pan across the map."));
    addItem(new HowToItem("9", "Zoom in/out", "To zoom in, place two fingers on the map and move them away from each other.\n\nTo zoom out, place two fingers on the map and pinch them together."));
    addItem(new HowToItem("10", "Center the map", "Touch the Center button to center the map on the red dot."));
    
  }

  private static void addItem(HowToItem item)
  {
    ITEMS.add(item);
    ITEM_MAP.put(item.id, item);
  }

  /**
   * An item representing a piece of content.
   */
  public static class HowToItem
  {
    public String id;
    public String content;
    public String description;

    public HowToItem(String id, String content, String description)
    {
      this.id = id;
      this.content = content;
      this.description = description;
    }

    @Override
    public String toString()
    {
      return content;
    }
  }
}
